static ArrayList<String> generate(long n)
    {
       ArrayList<String> temp = new ArrayList<>();
       Queue<String> q = new LinkedList<>();
       q.add("1");
       while(n-->0){
           String str = q.poll();
           temp.add(str);
           q.add(str+"0");
           q.add(str+"1");
       }
       return temp;
    }