class Sum {
    public static void main(String[] args) {
        int sum;
        int x;
        int y;
        
            x=Integer.parseInt(args[0]);
            y=Integer.parseInt(args[1]);
            sum = x+y;
        System.out.println("The addition of " + x  + " and "  + y +" is:"  + sum);
    }
}