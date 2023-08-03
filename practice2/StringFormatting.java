package sec03.chap07;

public class StringFormatting {
    public static void main(String[] args) {
        //  💡 문자열 다양하게 포매팅하기
        String[] strFormats = {
                "%s",    // 1. 기본
                "%2s",   // 2. 자리 확보
                "%.4s",  // 3. ~글자만
                "%2.4s", // 4.
                "%-5s",  // 5. 왼쪽 정렬
        };

        System.out.println("Hello");
    }
}
