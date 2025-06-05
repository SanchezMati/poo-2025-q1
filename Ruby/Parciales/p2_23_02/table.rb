# frozen_string_literal: true

class Table
  include Comparable
  def initialize(table_name, max_table_amount, section)
    @table_name = table_name
    @max_table_amount = max_table_amount
    @section = section
  end

  def <=>(other)
    return nil unless other.is_a?(Table)
    [other.max_table_amount, @table_name] <=> [@max_table_amount, other.table_name]
  end

  def to_s = "Table #{@table_name} for #{@max_table_amount} people in section #{@section}"

  protected attr_reader :max_table_amount, :table_name
end
