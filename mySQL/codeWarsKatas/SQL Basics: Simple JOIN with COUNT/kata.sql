select p.id, p.name, count(t.id) toy_count from people p
join toys t on t.people_id = p.id
group by p.id