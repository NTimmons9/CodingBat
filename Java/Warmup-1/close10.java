public int close10(int a, int b) {
  int c = a - 10;
  int d = b - 10;
  c = Math.abs(c);
  d = Math.abs(d);
  if (c < d){
    return a;
  }
  if (c == d){
    return 0;
  }
  return b;
}
