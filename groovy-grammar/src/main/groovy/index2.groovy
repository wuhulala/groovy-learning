import groovy.json.JsonOutput

class Score{
    String type
    int value
}
def calc(String type, int value){
    def result = new Score()
    result.type = type
    result.value = value
    return JsonOutput.toJson(result)
}