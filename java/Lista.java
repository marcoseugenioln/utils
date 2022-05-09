/**
 * Lista
 */
package src;

public class Lista {

    public Lista(int size){
        setSize(size);
        lista = new int [size];

        for(int i = 0; i < this.size - 1; i++){
            this.lista[i] = 0;
        }
    }

    /* Private atributes */
    private int size;
    private int lista [];

    private void setSize(int size) {
        this.size = size;
    }

    public void add(int data){

        if(!this.contains(0)){
            System.out.println("List if full!\n");
            return;
        }

        for(int i = 0; i < this.getSize(); i++){
            if(this.lista[i] == 0){
                this.lista[i] = data;
                return;
            }
        }
    }

    public int remove(int index){
        int removed = this.lista[index];
        this.lista[index] = 0;
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

    public void read(){
        System.out.print("Lista = { ");
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