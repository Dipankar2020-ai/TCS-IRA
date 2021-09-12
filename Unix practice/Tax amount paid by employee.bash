sort -nrk1 -t ";"| awk 'BEGIN{FS=";"}
   {
       a=$3*0.2;
       print $1,a;
   }'|sort -nrk2 -t " "|head -3
