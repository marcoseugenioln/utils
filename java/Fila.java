package src;
/**
 * Fila
 */
public class Fila {

    public Fila(int size){
        setSize(size);
        lista = new int [size];
    }

    /* Private atributes */
    private int size;
    private int emptyPosition = 0;
    private int lista [];

    private void setSize(int size) {
        this.size = size;
    }
    

    public void add(int data){
        if(this.emptyPosition < this.size){
            lista[this.emptyPosition] = data;
            this.emptyPosition = this.emptyPosition + 1;
            if(this.emptyPosition == size - 1){
                System.out.println("Queue is full!\n");
            }
        }
        else{
            System.out.println("Queue if full!\n");
        }
    }

    public int remove(int index){
        int removed = this.lista[0];

        for(int i = 0; i < this.size - 1; i++){
            this.lista[i] = this.lista[i + 1];
        }

        return removed;
    }

    public boolean contains(int data){

        boolean result = false;

        for(int i = 0; i < this.size; i++){
            if(lista[i] == data){
                result = true;
            }
        }

        return result;
    }

    public int getSize(){
        return this.size;
    }

    public int getPosition(int data){
        int position = 0;

        if(contains(data)){
            for(int i = 0; i < this.size; i++){
                if(this.lista[i] == data){
                    position = i;
                }
            }
        }
        else{
            System.out.println("Number not a member of queue!");
        }

        return position;
    }

    public void read(){
        System.out.print("Fila = { ");
        for (int i = 0; i < size; i++){
            if (i == size - 1){
                System.out.print(this.lista[i] + " }");
            }
            else{
                System.out.print(this.lista[i] + ", ");
            }
        }
        System.out.println("\n");
    }

    public void read(int index){
        System.out.println("\n");
        System.out.print("[" + this.lista[index] + "]");
        System.out.println("\n");
    }

}