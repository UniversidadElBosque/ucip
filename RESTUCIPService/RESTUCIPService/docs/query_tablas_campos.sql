select * 
from information_schema.columns 
where table_schema = 'public'
order by table_name;
