package varages;

public class VaragesRole {
    public static void main(String[] args) {
        firstSuccessRole("sungcheoL", 1, 2, 3, 4, 5);
        //firstFailRole("sung","cheol",1) //Error
    }
    public static void firstSuccessRole(String names, int... counts){
        // ... 성공
    }
    /**
    public static void firstFailRole(String... names, int counts){
        오류 : Vararg parameter must be the last in the list
    }
    public static void SecondFailRole(String... names, int ...counts){
        // 오류: 두 개 이상의 Varargs는 사용할 수 없습니다.
    }
     **/
}
