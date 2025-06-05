don_julio = Restaurant.new('Don Julio')

terrace = Section.new('Terraza')
main_floor = Section.new('Planta Baja')

# Se agrega una mesa de nombre T1 y capacidad 4 en la sección Terraza
don_julio.add_table(terrace, 'T1', 4)
don_julio.add_table(terrace, 'T3', 3)
don_julio.add_table(Section.new('Terraza'), 'T3', 5)
# La siguiente no se agrega porque ya existe una con el mismo nombre y capacidad
don_julio.add_table(terrace, 'T3', 5)
don_julio.add_table(main_floor, 'Mesa 1', 4)
don_julio.add_table(main_floor, 'Mesa 2', 4)
don_julio.add_table(Section.new('Planta Baja'), 'Otra', 8)

# Se obtienen todas las mesas de la sección Terraza
# en orden descendente por capacidad y desempata alfabético por nombre
don_julio.tables(terrace).each { |table| puts table }
# Table T3 for 5 people in section Terraza
# Table T1 for 4 people in section Terraza
# Table T3 for 3 people in section Terraza
don_julio.tables(main_floor).each { |table| puts table }
# Table Otra for 8 people in section Planta Baja
# Table Mesa 1 for 4 people in section Planta Baja
# Table Mesa 2 for 4 people in section Planta Baja


begin
  # Se arroja un error porque no existe la sección
  don_julio.tables(Section.new('Segundo Piso'))
rescue ArgumentError => e
  puts e # Section does not exists
end

# Se obtiene la cantidad de secciones del restaurant
puts don_julio.sections_count # 2
# Se obtiene la cantidad de mesas de una sección del restaurant
puts don_julio.tables_count(terrace) # 3
puts don_julio.tables_count(main_floor) # 3
begin
  # Se arroja un error porque no existe la sección
  don_julio.tables_count(Section.new('Segundo Piso'))
rescue ArgumentError => e
  puts e # Section does not exists
end


