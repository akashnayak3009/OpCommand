class Test15{
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Put valid number");
        }
        else{
            for(int i =0; i<args.length;i++){
                try{Long.parseLong(args[i]);
                    System.out.println("args["+i+"]:"+args[i]);
                }
                catch(NumberFormatException e){
                    System.out.println("invalid ");
                }
                
            }
        }
        
    }
}