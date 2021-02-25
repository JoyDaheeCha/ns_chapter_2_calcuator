/*
* Writer : 차다희
* class 기능: 문자열을 입력 받아 덧셈을 하는 계산기
* 세부 기능 리스트
* (1) : 또는 , 를 구분자로 가지는 문자열을 받아 총 합 값을 구하기. (e.g.) "1,2:3" => 6
* (2) (1)의 기본 구분자 2가지 외 추가 구분자를 받아 덧셈 실행. 추가 구분자는 "//"와 "\n" 사이에 들어감. (e.g.) "//;\n1;2;3" => 6
* (3) 문자열에 음수가 전달될 경우 RuntimeException 실행
* */

public class StringCalculator {

    // 질문. 파라메터에 digitsStr가 나은가? 아니면 digits?
    // 코드가 길 경우, 가독성 위해서는 digitsStr가 나은데, 사실 String이라 명시해서 흠....

    int basicAdd(String digitsStr) {
        int sum = 0;
        digitsStr.split(":");
        return sum;
    }

    // : 단위로 문자열 끊기
    String[] splitStrByColon(String digitsStr) {
        String[] strArr = digitsStr.split(":");
        return strArr;
    }

    // , 단위로 문자열 끊기
    String[] splitStrBySemiColon(String digitsStr) {
        String[] strArr = digitsStr.split(",");
        return strArr;
    }

    // String 배열을 int 배열로 바꾸기
    int [] convertStrArrToIntArr(String[] digitsStr) {

        int[] intArr = new int[digitsStr.length];

        for(int i = 0; i < digitsStr.length; i++) {
            // 이거 트라이 캐치로 감싸는게 맞을까? 트라이캐치는 언제 써야 적절하지?
            // https://stackoverflow.com/questions/7646392/convert-string-to-int-array-in-java/7646415
            intArr[i] = Integer.parseInt(digitsStr[i]);
        }

        return intArr;
    }

}
