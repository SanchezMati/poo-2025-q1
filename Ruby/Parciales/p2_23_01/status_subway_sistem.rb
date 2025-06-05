# frozen_string_literal: true

class StatusSubwaySistem < SubwaySystem
  def initialize(city)
    super
    @open = true
  end

  def close_station
    @open = false
  end

  def open_station
    @open = true
  end
end
