public boolean parrotTrouble(boolean talking, int hour) {
  if ((talking == true && hour < 7) || (talking == true && hour > 20)){
    return true;
  }
  return false;
}