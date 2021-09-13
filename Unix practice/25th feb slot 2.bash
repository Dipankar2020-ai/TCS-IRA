awk 'BEGIN{FS=","}
{
    if($1=="Jan")
    {
        sum=sum+$3*$5
        c=c+1
    }
}
END{ if(c>1)
{
    print sum
}
else
{
  print "No stocks Found"
 }
 }'
