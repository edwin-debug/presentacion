public class main 
{
    public static void main(String[] args)
    {
        //funcionMultiplicacion();
        matrices();
    }
    static void funcionMultiplicacion()
    {
        int num = 2;
        for(int i=0; i<=10; i++)
        {
            System.out.println(num + "x" + i + "=" + (i*num));
        }
    }
    static void matrices()
    {
        String[] lista = {"Manzana", "Pera","Platano"};
        lista[0] = "Sandia";
        for (String i : lista) {
            if (lista[i] == "hola") {
                System.out.println("false");
            }
        }
    }
}