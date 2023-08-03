package sec03.chap07;

public class StringFormatting {
    public static void main(String[] args) {
        //  💡 문자열 다양하게 포매팅하기
        String[] strFormats = {
                "%s",    // 1. 기본
                "%2s",   // 2. 자리 확보
                "%.5s",  // 3. ~글자만
                "%2.5s", // 4.
                "%-5s",  // 5. 왼쪽 정렬
        };

        String[] strResults = new String[strFormats.length];

        for (var i = 0; i < strFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (var j = 0; j < 2; j++) {
                format += strFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, "Hi", "하이염");

            strResults[i] = format.formatted("Hello", "하이염");
        }

        System.out.println("하하하");
    }
}
