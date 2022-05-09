package src;

public class Pilha {
    public Pilha(int size){
        setSize(size);
        lista = new int [size];
    }

    /* Private atributes */
    private int size;
    private int emptyPosition = 0;
    private int lista [];
    private boolean enabled = true;

    private void setSize(int size) {
        this.size = size;
    }

    public void add(int data){
        if(this.enabled){
            lista[this.emptyPosition] = data;
            this.emptyPosition = this.emptyPosition + 1;
            if(this.emptyPosition == size - 1){
                System.out.println("Pile is full!\n");
            }
        }
        else{
            System.out.println("Pile if full!\n");
        }
    }

    public int remove(){
        int removed = this.lista[this.emptyPosition - 1];
        this.lista[this.emptyPosition - 1] = 0;
        this.emptyPosition = this.emptyPosition - 1;
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
            System.out.println("Number not a member of pile!");
        }

        return position;
    }

    public void read(){
        System.out.print("Pilha = { ");
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
