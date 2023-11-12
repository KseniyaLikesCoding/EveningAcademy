public class PrintInformation {
    public static void main(String[] args) {

        System.out.println("Hello World !");
        System.out.println("Добро пожаловать в Evening Academy!");
        basic();
        funnyCharacters();
        concatenation();
        willBeEasierLater();
        smiley();

    }

    public static void basic() {
        System.out.println("На первом уроке я расскажу как установить Idea и мы напишем первую программу на Java");
    }

    public static void funnyCharacters() {
        System.out.println("Также мы научимся находить на клавиатуре различные символы, например: [] {} /\\  +-/* <> `` ~ | &");
    }

    public static void concatenation() {
        System.out.println("А с помощью конкатенации мы можем выполнить арифметические операции, например: 10 + 10 = " + (10 + 10));
    }

    public static void willBeEasierLater() {
        System.out.println("Дальше будет легче!");
    }

    public static void smiley() {
        System.out.println(":-)");
    }
}