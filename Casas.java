class Casa {
    String Poblacion;
    String Direccion;
    Integer NHabitaciones;
    Double PrecioHora;
    String CampoClave;
    Boolean EsAlta;
    Casa(String Pob, String Dir, int NH,Double PH, String CC){
        this.Poblacion = Pob;
        this.Direccion = Dir;
        this.NHabitaciones = NH;
        this.PrecioHora = PH;
        this.CampoClave = CC;
        this.EsAlta = true;
    }
    public void Eliminar (){
        this.EsAlta = false;
    }

}