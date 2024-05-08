public class TablaHash {
    public  Integer FuncionHash(String CampoClave) {

        int Indice = Integer.parseInt(CampoClave);
        Indice = Indice * Indice;
        String StrNum;
        StrNum = Integer.toString(Indice);
        Indice = Integer.parseInt(StrNum.substring(0,1));
        if (Indice < 101) {
            return Indice;
        }
        else{
            return Integer.parseInt(StrNum.substring(0,1));
        }
    }
    public Integer Colisiones(int Clave, int i){
        int P = Clave;
        int res;
        res = P + (i * i);
        return res;
    }

}