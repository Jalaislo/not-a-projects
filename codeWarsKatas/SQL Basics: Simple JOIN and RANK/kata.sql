select p.id, p.name, count(s.sale) sale_count, rank() over (order by count(s.sale)) sale_rank from people p
join sales s on s.people_id = p.id
group by p.id
order by sale_rank