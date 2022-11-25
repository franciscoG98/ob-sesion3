public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Diego", "Pablo", "Rodrigo", "Lionel"};

        String result = "";
        for(String nombre : nombres) {
            result += nombre + " ";
        }

        System.out.println(result);
    }

}