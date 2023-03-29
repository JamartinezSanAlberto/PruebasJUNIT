public class Dado {

    public Dado(){
        System.out.println("Hola soy el constructor");
    }
    public int get_value(int Caras, int nonum){
        System.out.println("Hola soy el metodo get_Value");
        if (Caras != 6 && Caras!=10) {
            throw new IllegalArgumentException();
        }
        int resultado= (int)(Math.random()*Caras+1); ;
        if (resultado==nonum){
            return get_value(Caras,nonum);
        }else{

           return resultado;
       }
    }
}
