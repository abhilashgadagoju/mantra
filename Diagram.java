class Diagram{
    public static void main(String args[]){
        int space=1;
        for(int i=5;i>0;i--){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space++;
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}