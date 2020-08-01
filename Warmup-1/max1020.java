public int max1020(int a, int b) {
  if (((a <= 20) && (a >= 10)) || ((b >= 10) && (b <= 20))){
    if ((a > b) && ((a <= 20) && (a >= 10))){
      return a;
    }
    else if ((b <= 20) && (b >= 10)){
      return b;
    }
    else{
      return a;
    }
  }
  return 0;
}
