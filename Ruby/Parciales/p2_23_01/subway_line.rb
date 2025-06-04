# frozen_string_literal: true

class SubwayLine
  def initialize(letter)
    @letter = letter
  end

  def to_s
    "Subway Line #{letter}"
  end

  attr_reader :letter
end
