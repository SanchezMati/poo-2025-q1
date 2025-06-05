# frozen_string_literal: true

class SubwaySystem
  def initialize(city)
    @city = city
    @stations_by_line = {}
  end
  def add_station(letter, station_name)
    line = SubwayLine.new(letter)
    @stations_by_line[line] = Set.new unless @stations_by_line.key?(line) #Es sorted_set
    station = SubwayStation.new(station_name)
    @stations_by_line[line].add(station)
  end

  def lines
    @stations_by_line.keys
  end

  def stations(letter)
    line = SubwayStation.new(letter)
    @stations_by_line[line]
  end

end
