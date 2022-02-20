import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao2 {
    public static void main(String args[]) {
        System.out.println("DICAS PARA SENHA FORTE :");
        System.out.println("Possuir no mínimo 6 caracteres.");
        System.out.println("Conter no mínimo 1 digito");
        System.out.println("Conter no mínimo 1 letra em minúsculo");
        System.out.println("Conter no mínimo 1 letra em maiúsculo");
        System.out.println("Contér no mínimo 1 caractere especial. Os caracteres especiais são: (!@#$%^&*()-+)");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua Senha:"); // cria um scanner para pedir o valor de entrada
        String password = scanner.next();
        if (validaTamanho(password) && umDigito(password) && letraMin(password) && carEsp(password) && letraMai(password)) {
            System.out.println("Parabéns,Sua senha está forte e confiável ");
        }
        scanner.close();

    }

    //<TIPÒ DE VISIBILIDADE> <TIPO DE RETORNO>
    public static boolean validaTamanho(String senha) {//método para validar o tamanho da senha
        if (senha.length() < 6) {
            System.out.println("Tamanho da senha invalida, Faltam " + (6 - senha.length()) + " Caracteres");
            return false;
        }

        return true;
    }

    public static boolean umDigito(String senha) {//metódo para checar se a senha tem um digito
        Matcher m1 = Pattern.compile("(?=.*[0-9])").matcher(senha);
        if (!m1.find()) {
            System.out.println("A senha precisa ter um digito ao menos");
            return false;
        }
        return true;
    }


    public static boolean letraMai(String senha) {//metódo para checar se a senha  tem uma letra maiuscula
        Matcher m3 = Pattern.compile("(?=.*[A-Z])").matcher(senha);
        if (!m3.find()) {
            System.out.println("A senha precisa ter um caractere maiusculo");
            return false;
        }
        return true;
    }

    public static boolean letraMin(String senha) {//metódo para checar se a senha tem letra minuscula
        Matcher m2 = Pattern.compile("(?=.*[a-z])").matcher(senha);
        if (!m2.find()) {
            System.out.println("A senha precisa ter um caractere minusculo");
            return false;
        }
        return true;
    }

    public static boolean carEsp(String senha) {//metódo para checar se a senha char especial
        Matcher m4 = Pattern.compile("(?=.*[!@#$%^&*()-+])").matcher(senha);
        if (!m4.find()) {
            System.out.println("A senha precisa ter no minimo um caractere especial");
            return false;
        }
        return true;
    }


}

