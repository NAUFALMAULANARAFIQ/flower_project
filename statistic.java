public static void main(String[] args) {
    int[]Data = {128,63,97,134,133,136,125,110,118,94,76,84,132,105,80,47,100,77,120,109,90,
        72,103,78,94,118,111,80,141,94};
    int MIN = 0;
    int MAX = 0;
    
    for(int i = 0; i < Data.length; i++)
        System.out.print(Data[i] + "|");
    
    MAX = Data[0];
    for(int i = 0; i <= Data.length-1; i++)
    { 
        if(MAX>Data[i+1]){
        MAX=MAX;
        
        }    else
            MAX=Data[i+1];
    }
        System.out.println(" ");
        System.out.println("MAX = "+ MAX);
        }