# Se instancia un sistema que permite registrar estaciones de subte y las líneas
# a las que pertenecen, que inicialmente arranca sin líneas y sin estaciones
baires = SubwaySystem.new('Buenos Aires')
# Se agrega la estación Plaza de Mayo para la Línea A
plaza_de_mayo = baires.add_station('A', 'Plaza de Mayo')
puts plaza_de_mayo # Subway Station Plaza de Mayo
baires.add_station('A', 'Alberti')
baires.add_station('H', 'Parque Patricios')
baires.add_station('A', 'Alberti')


# Se itera por las líneas de subte en orden alfabético por línea
baires.lines.sort.each { |line| puts line }
# Subway Line A
# Subway Line H


# Se itera por las estaciones de la línea A en orden alfabético por estación
baires.stations('A').each { |station| puts station }
# Subway Station Alberti
# Subway Station Plaza de Mayo


# El método stations retorna nil si la línea no existe y no se puede iterar
puts baires.stations('F').nil? # true




# Se instancia un sistema que permite registrar estaciones de subte
# que cuentan con el estado Abierto/Cerrado, y las líneas
# a las que pertenecen, que inicialmente arranca sin líneas y sin estaciones
baires_st = ……….……….……….……….
  # Se agrega la estación Plaza de Mayo para la Línea A con el estado abierto
  plaza_de_mayo_st = baires_st.add_station('A', 'Plaza de Mayo')
puts plaza_de_mayo_st # Subway Station Plaza de Mayo is Open
# Se cierra la estación Plaza de Mayo
plaza_de_mayo_st.close_station
puts plaza_de_mayo_st # Subway Station Plaza de Mayo is Closed
baires_st.add_station('A', 'Alberti')
baires_st.add_station('H', 'Parque Patricios')
baires_st.add_station('A', 'Alberti')


# Se itera por las líneas de subte en orden alfabético por línea
baires_st.lines.sort.each { |line| puts line }
# Subway Line A
# Subway Line H


# Se itera por las estaciones de la línea A en orden alfabético por estación
# indicando para cada estación si está abierta o cerrada
baires_st.stations('A').each { |station| puts station }
# Subway Station Alberti is Open
# Subway Station Plaza de Mayo is Closed


# Se abre la estación Plaza de Mayo de la línea A
plaza_de_mayo_st.open_station


# Se itera por las estaciones de la línea A en orden alfabético por estación
# indicando para cada estación si está abierta o cerrada
baires_st.stations('A').each { |station| puts station }
# Subway Station Alberti is Open
# Subway Station Plaza de Mayo is Open