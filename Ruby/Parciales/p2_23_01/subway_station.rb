# frozen_string_literal: true

class SubwayStation
  def initialize(name)
    @name = name
  end

  def to_s
    "Subway Station #{name}"
  end

  attr_reader :name
end
