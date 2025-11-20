package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /* 변수 명명 규칙 */

        // 1-1 동일한 범위 {} 내에서는 동일한 변수명 사용 불가
        int age;

        // 1-2. 예약어 사용 불가

        // 1-3. 변수명은 대소문자를 구분한다
        int a;
        int A;

        // 1-4. 변수명은 숫자로 시작할 수 없다

        // 1-5. 특수 기호는 _,$ 만 사용 가능하다
        int _age;
        int $age;
        int a_ge$;

        /* 개발자들의 약속(규약) */
        // 2-1. 변수명의 길이 제한은 없다
        int ldanwldknalwkdmlawmdlawkmdlkawmklgkemlgmrg = 10;
        System.out.println("ldanwldknalwkdmlawmdlawkmdlkawmklgkemlgmrg = " + ldanwldknalwkdmlawmdlawkmdlkawmklgkemlgmrg);

        // 2-2. 여러 단어의 합성어는 Camel case 형식으로 작성한다
        int showMeTheMoney;

        // 2-3. 단어와 단어 사이를 연결할 때, '_' 를 사용하지 않는다.
        int show_me_the_money;

        // 2-4. 한글로 변수명을 설정하지 않는다
        int 반갑습니다 = 10;
        System.out.println("반갑습니다 = " + 반갑습니다);

        // 2-5. 변수명은 저장된 값이 어떤 의미를 가지는지 알 수 있게 작명한다

        // 2-6. 전형적인 변수명이 있다면 사용한다.

        // 2-7. 변수명은 명사로 작성할 수 있도록 한다.

        // 2-8. boolean 변수 이름은 가급적 의문문으로 선언한다.
    }

}