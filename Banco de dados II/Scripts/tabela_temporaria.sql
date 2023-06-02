create temporary table t_cliente 
select distinct c.ClienteID
from clientes c;

select tc.ClienteID
from t_cliente tc;