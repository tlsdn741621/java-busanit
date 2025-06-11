package d250611.ch8_1;

public class Generic_Ex1 {
    // 제너릭, 타입 안정성을 높이는 방법
    // <> : 다이어몬드 연산자를 통해서표현
    // 예시
    // class Box<T> {
    //    private T value;
    //    public void set (T value) {this.value = value;}
    //    public T get() {retuen value;}
    //}
    // 사용
    // Box<String> stringBox = new Box<>();
    // stringBox.set("hi");
    // string s = stringBox.get();

    // 많이 사용하는 옵션 예시
    // <T> : 타입 파라미터, 어떤 타입이든 받을 수 있음.
    // <K,V> : Key,Value 주로 Map 데이터 형태에서 사용
    // <?> : 모든 타입 허용(와일드카드)
    // <? extends T> : 허용하는 타입 T, 또는 T의 하위 타입(자식 타입)만 허용, (상한제한)
    // <? extends Animal>
    // <? super T> : 허용하는 타입 T, 또는 T의 상위 타입(부모 타입)만 허용, (하한제한)
}
