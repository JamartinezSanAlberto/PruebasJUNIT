public class Calculadora {

    public double suma (double a, double b){
        return a+b;
    }

    public double resta (double a, double b){
        return a-b;
    }

    public double multiplica (double a, double b){
        return a*b;
    }

    public double divide (double a, double b){
       if (b==0){
           throw new IllegalArgumentException();
       }else {
           return a / b;
      }
    }

    public int sumadados (Dado D1, Dado D2, int Caras, int nonum){
        try {
          return D1.get_value(Caras, nonum) + D2.get_value(Caras, nonum);
        }
        catch(Exception e){
            return 0;
        }

    }

}
