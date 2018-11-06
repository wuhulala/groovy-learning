def main(Map<String, Object> config) {

    int min = config.get("min")
    int middle = config.get("middle")
    int max = config.get("max")
    Map<String, Object> data = config.get("data")
    int x = data.get("x")

    Map<String, Object> result = new HashMap<>()
    String message
    if (x < min) {
        message = "无风险"
    } else if (x >= min && x < middle) {
        message = "初级风险"
    } else if (x >= middle && x <= max) {
        message = "中等风险"
    } else {
        message = "高风险"
    }
    result.put("message", message)
    return result
}