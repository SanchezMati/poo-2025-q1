# frozen_string_literal: true

class SubwayStation
  include Comparable
  def initialize(name)
    @name = name
  end

  def to_s
    "Subway Station #{name}"
  end

  def <=>(other)
    return nil unless other.is_a?(SubwayStation)
    @name <=> other.name
  end

  protected attr_reader :name
end
