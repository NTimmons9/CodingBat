public int intMax(int a, int b, int c) {
  if (a > b){
    if(a > c){
      return a;
    }
    return c;
  }
  if (b > c){
    if(b > a){
      return b;
    }
    return a;
  }
  if (c > a){
    if(c > b){
      return c;
    }
    return b;
  }
  return a;
}

