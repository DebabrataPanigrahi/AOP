aspect Tracking
  {
   pointcut unsafe():(call(*Human.errage(..)));
   pointcut chk():(execution(*Human.errage(..)));
   
   declare error : unsafe():"print::this method is not safe";
   declare warning : chk():"print::enter age 18";
  }