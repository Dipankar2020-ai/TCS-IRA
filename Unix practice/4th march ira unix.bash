awk 'BEGIN {FS="-";count=0}
{
    if(($2==$3)&&($3==$4))
    {
        print $1"-"$2"-"$3"-"$4;
        count+=1;
    }
}
END {print "Total: " count;}'
