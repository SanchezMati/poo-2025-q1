name = "Mati Sanchez"

puts "Hola Ruby, soy " + name + "."

# Genera un número aleatorio entre 1 y 1_000_000
numero = rand(1..1_000_000)
numero_de_salvi = 597300

i = 0
until numero == 597300
  numero = rand(1..1_000_000)
  i += 1
end

puts "La cantidad de intentos fue #{i}"