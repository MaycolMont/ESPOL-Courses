
package espol.poo.modelo;

public class Pokemon{
    //variables de instancia de la clase
    private String especie; //null -> modificador public
    private String nombre; //null -> modificador public
    private int puntosSalud; //0 -> modificador private
    int puntosCombate; //0 -> modificador predeterminado

    /**
     * Constructor que recibe nombre, especie, puntos de salud
     * y puntos de combate y los asigna al pokemon
     * @param nombre
     * @param especie
     * @param puntosSalud
     * @param puntosCombate 
     */
    public Pokemon(String nombre, String especie, 
            int puntosSalud, int puntosCombate){
        //la palabra reservada this se usa para hacer referencia la objeto
        //this.nombre -> la variable de instancia nombre del objeto
        //nombre -> argumento del método
        this.nombre = nombre;
        this.especie = especie;
        this.puntosSalud = puntosSalud;
        this.puntosCombate = puntosCombate;
    }
    
    /**
     * Constructor que recibe le nombre del pokemon y la especie, los asigna 
     * al pokemon y asigna como valores predeterminados puntosSalud a 100 y
     * puntosCombate a 200
     * @param nombre: nombre del pokemon
     * @param especie: especie del pokemon
     */
    public Pokemon(String nombre, String especie){
        //this(args,args,..) se usa para dentro de un constructor
        //llamar a otro constructor de la misma clase
        //llama al contructor con firma Pokemon(String, String, int, int)
        this(nombre,especie,100,200); 
    }
    
    /**
     * Constructor sin parámetros para poder crear un pokemon con los valores
     * predeterminados
     */
    public Pokemon(){}

    public String getName(){
      return nombre;
    }

    public void setName(String nombre){
      this.nombre = nombre;
    }

    public String getEspecie(){
      return especie;
    }

    public int getPuntosSalud(){
      return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud){
      this.puntosSalud = puntosSalud;
    }

    public int getPuntosCombate(){
      return puntosCombate;
    }

    public void setPuntosCombate(int puntosCombate){
      this.puntosCombate = puntosCombate;
    }

    /**
     * Metodo que muestra la información de un pokemon
     */
    public void mostrarInformacion(){
        System.out.printf("especie: %s\nnombre: %s\n"
                + "puntosSalud: %d\npuntosCombate: %d\n",
                especie,nombre,puntosSalud,puntosCombate);
    }

    public void saludar(int numerveces){
      for(int i=0;i<numerveces; i++){
        System.out.println(nombre);
      }
    }

    public boolean esquivar(){
      return Math.random()>0.5;
    }

   public void comer(Alimento alimento){
     puntosSalud += alimento.getValorNutricional();
   }
}
