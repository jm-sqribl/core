create table people (
	name text,
	saying text,
	id timeuuid,
	primary key((name),id)
) with clustering order by (id desc);