import java.util.Arrays;
import java.util.List;

public class PhoneNumberValidator {

    public static boolean isHptype(String phoneNumber) {
        // phoneNumber가 null이거나 비어 있는 경우, false 반환
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        
        // 전화번호의 공백을 제거합니다.
        phoneNumber = phoneNumber.trim();
        
        // 전화번호의 길이가 너무 짧거나 너무 길면 유효하지 않다고 간주합니다.
        if (phoneNumber.length() < 10 || phoneNumber.length() > 11) {
            return false;
        }
        
        // 전화번호의 지역 코드 추출
        String areaCode = phoneNumber.substring(0, 3);
        List<String> validAreaCodes = Arrays.asList("010", "011", "016", "017", "018", "019");
        
        // 지역 코드가 유효하고 전화번호 길이가 맞는지 확인
        return validAreaCodes.contains(areaCode);
    }
}
