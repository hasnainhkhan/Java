class Prob00{
    // shift all zero at the end of the array
    public static void main(String [] args) {
        int [] arra={1,0,0,2,1,0,5};
        int j=0;
        for(int i=0;i<arra.length;i++){
            if(arra[i]!=0){
                int temp = arra[i];
                arra[i] = arra[j];
                arra[j] = temp;
                j++;
    
    }
    }
 
}
    }