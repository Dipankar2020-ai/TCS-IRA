awk 'BEGIN {FS=";"}
{
    if($3=="programmer")
    {
        print $2","$3","$4","$4*12
        c=c+1
    }
}
END{ if(c==0){print "No programmer Found"}}'
