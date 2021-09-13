Code-
awk 'BEGIN {FS="|"}
{
    if(!($1~/[0-9][0-9][0-9][-]/))
    {
        print $2
    }
}'
  
 I/P:-
 101-AS234|Bimal das|90887678
102-345123|Raja pal|87680097
A12-666778|Subha kundu|9878

O/P:-
Subha kundu
