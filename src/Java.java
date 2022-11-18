public class Java {
    public static void main(String[] args) {

        //Operadores Aritmeticos

        int variableX = 50, variableY = 10;
        int resultado2;

        resultado2 = variableX + variableY;
        System.out.println(resultado2);

        resultado2 = variableX - variableY;
        System.out.println(resultado2);

        resultado2 = variableX * variableY;
        System.out.println(resultado2);

        resultado2 = variableX / variableY;
        System.out.println(resultado2);

        //Incrementa en 1
        variableX++;
        System.out.println(variableX);
        //Decrece en 1
        variableX--;
        System.out.println(variableX);

        //Incrementa o Decrece el numero que se indique
        variableX += 100;
        System.out.println(variableX);

        variableX -= 100;
        System.out.println(variableX);


        //Multiplicar la varibale

        variableX *= 3;
        System.out.println(variableX);

        //Dividir
        variableX /= 3;
        System.out.println(variableX);

        //Operadores Relacicionales


        int variable1 = 300, variable2 = 200;
        boolean resultado1;


        resultado1 = variable1 > variable2;
        System.out.println(resultado1);

        resultado1 = variable1 < variable2;
        System.out.println(resultado1);


        resultado1 = variable1 >= variable2;
        System.out.println(resultado1);


        resultado1 = variable1 <= variable2;
        System.out.println(resultado1);


        resultado1 = variable1 == variable2;
        System.out.println(resultado1);


        resultado1 = variable1 != variable2;
        System.out.println(resultado1);


        //Operador Logico
        // AND
        boolean resultado;

        resultado = 5 >= 5 && true && 10 > 9;
        System.out.println(resultado);

        //OR

        resultado = false || false || false || true;
        System.out.println(resultado);

        resultado = (5 >= (2*3) || true ) && (true && 10 > 5);
        System.out.println(resultado);

        //NOT

        System.out.println(!true);
        //true == false
        //false == true
        //Implementar "!"


        //Operador Ternario

        //expresion1 ? expresion2 : expresion3
        //Si expresion1 = true entonces expresion2
        //Si expresion1 = false entonces expresion3
        String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
        System.out.println(mensaje);

    }
}