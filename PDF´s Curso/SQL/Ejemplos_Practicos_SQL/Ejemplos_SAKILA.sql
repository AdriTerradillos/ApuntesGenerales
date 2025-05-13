SELECT
	film_id
    , title
FROM film
WHERE title LIKE "%EGG";

-- ¿Cuánto dura la película?
SELECT
	title
    , length
FROM film
WHERE title = "AFRICAN EGG";

-- ¿Cuál es la duración máxima?
SELECT 
	MAX(length)
FROM film;

-- ¿Qué película tiene esa duración máxima?
		-- El valor de la duración máxima son 185 mins y lo obtengo con la query SELECT MAX(length) FROM film
        
SELECT
	film_id
    , title
FROM film
WHERE (SELECT MAX(length) FROM film) <= length;


-- Actores que han participado en más películas
	-- Cada actor en cuántas películasnDISTINTAS ha salido
    
-- Cada actor (por ID) en cuántas películas distintas sale
SELECT *
FROM film_actor;

SELECT
	a.actor_id
    , CONCAT(a.first_name, ' ', a.last_name) nombre_actor
    , acp.cantidad_peliculas
FROM actor a
JOIN  
	(SELECT
		actor_id
		, COUNT(DISTINCT film_id) cantidad_peliculas
	FROM film_actor
	GROUP BY actor_id) acp
ON a.actor_id = acp.actor_id
ORDER BY acp.cantidad_peliculas DESC
LIMIT 1;


-- Muestra todos los registros de la tabla actor
SELECT *
FROM actor;

-- Muestra todos los registros de la tabla film
SELECT *
FROM film;

-- Muestra todos los registros de la tabla film que su año de lanzamiento sea 2010
SELECT *
FROM film
WHERE release_year = 2010; -- no saldrá ninguna porque todas son de 2006


-- Películas para adultos (mayores de 18)
SELECT *
FROM film
WHERE rating = "R" 
	AND length > 120;
    

-- ¿Qué películas están en el inventario?
SELECT
	f.film_id
    , title
    , i.inventory_id
    , i.store_id
FROM film f
JOIN inventory i
	ON f.film_id = i.film_id;
    

-- ¿En cuántos píses tengo clientes?
SELECT *
FROM country; -- así veo todos los países de mi base de datos

-- Quiero ver los clientes que tengo en Spain
SELECT 
	CONCAT(c.first_name, ' ', c.last_name) nombre
    , c.store_id
    , c.email
    , c.active
FROM customer c
JOIN address a
	ON c.address_id = a.address_id
JOIN city ci
	ON a.city_id = ci.city_id
JOIN country cou
	ON ci.country_id = cou.country_id
WHERE cou.country = "Spain";